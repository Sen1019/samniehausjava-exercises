CREATE TABLE deck(
	deck_id SERIAL,
	deck_name VARCHAR(255) NOT NULL UNIQUE,
	deck_format VARCHAR(255) NOT NULL,
	CONSTRAINT pk_deck_id PRIMARY KEY (deck_id)
);

CREATE TABLE card(
	id VARCHAR(255),
	layout VARCHAR(255),
	name VARCHAR(255) NOT NULL,
	names VARCHAR(255)[],
	manaCost VARCHAR(255),
	cmc DECIMAL(3,1),
	colors VARCHAR(255)[],
	colorIdentity VARCHAR(255)[],
	type VARCHAR(255),
	supertypes VARCHAR(255)[],
	subtypes VARCHAR(255),
	rarity VARCHAR(255),
	text VARCHAR(255),
	original_text VARCHAR(1275),
	flavor VARCHAR(1275),
	artist VARCHAR(255),
	number VARCHAR(255),
	power VARCHAR(255),
	toughness VARCHAR(255),
	loyalty INT,
	multiverse_id INT NOT NULL,
	variations INT[],
	image_name VARCHAR(255),
	watermark VARCHAR(255),
	border VARCHAR(255),
	timeshifted BOOLEAN,
	hand INT,
	life INT,
	reserved BOOLEAN,
	release_date VARCHAR(255),
	starter BOOLEAN,
	set VARCHAR(255),
	setName VARCHAR(255),
	printings VARCHAR(255)[],
	image_url VARCHAR(255),
	quantity INT NOT NULL,
	CONSTRAINT pk_multiverse_id PRIMARY KEY (multiverse_id)
);

CREATE TABLE deck_card(
	deck_id SERIAL REFERENCES deck(deck_id),
	multiverse_id INT REFERENCES card(multiverse_id) NOT NULL,
	quantitiy INT NOT NULL,
	CONSTRAINT pk_deck_card PRIMARY KEY (deck_id, multiverse_id)
	
)