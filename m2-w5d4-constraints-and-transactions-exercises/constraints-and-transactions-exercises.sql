-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

BEGIN TRANSACTION;
INSERT INTO actor (first_name, last_name) VALUES ('HAMPTON', 'AVENUE');
INSERT INTO actor (first_name, last_name) VALUES ('LISA', 'BYWAY');
COMMIT;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

BEGIN TRANSACTION;
INSERT INTO film (title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost) 
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 2, 1.99, 198, 12.99);
COMMIT;
select * from film where title like 'Euclid%';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

BEGIN TRANSACTION;
INSERT INTO film_actor (film_id,actor_id) VALUES (1001, 201);
INSERT INTO film_actor (film_id,actor_id) VALUES (1001, 202);
COMMIT;

select * from film_actor where film_id = 1001;
-- 4. Add Mathmagical to the category table.

BEGIN TRANSACTION;
INSERT INTO category (name) VALUES('Mathemagical');
COMMIT;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN TRANSACTION;

INSERT INTO film_category (film_id, category_id) 
VALUES ((SELECT film_id from film where title = 'Euclidean PI') ,(SELECT category_id from category where name = 'Mathemagical'));

UPDATE film_category SET category_id = (SELECT category_id from category where name = 'Mathemagical') 
WHERE film_id IN (SELECT film_id from film where title in ('EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));

COMMIT;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;
UPDATE film SET rating = 'G' WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = (SELECT category_id from category where name = 'Mathemagical'));
COMMIT;

-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;
INSERT INTO inventory (film_id, store_id) VALUES ((SELECT film_id from film where title = 'Euclidean PI'), 1);
INSERT INTO inventory (film_id, store_id) VALUES ((SELECT film_id from film where title = 'Euclidean PI'), 2);
COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM film WHERE title = 'Euclidean PI';
ROLLBACK;
-- Does not work because film_id is being used as a foriegn key in film_category.


-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM category WHERE name = 'Mathemagical';
ROLLBACK;
-- Does not work because category_id is being used as a foriegn key in film_category.

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM film_category WHERE category_id = (Select category_id from category where name = 'Mathemagical');
COMMIT;
--It succeeds because neither of film_category's primary keys were being used as foreign keys.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM category WHERE name = 'Mathemagical';
COMMIT;

BEGIN TRANSACTION;
DELETE FROM film WHERE title = 'Euclidean PI';
ROLLBACK;
--DELETE mathemagical worked because there was nothing using it anymore, where Euclidean is still technically in the store's inventory and film actor

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

-- we have to remove it from the store's iventory and film_actor first.

BEGIN TRANSACTION;
DELETE FROM inventory WHERE film_id = (SELECT film_id from film where title = 'Euclidean PI');
DELETE FROM film_actor WHERE film_id = (SELECT film_id from film where title = 'Euclidean PI');
COMMIT;

BEGIN TRANSACTION;
DELETE FROM film WHERE title = 'Euclidean PI';
COMMIT;

--YAY SUCCESS