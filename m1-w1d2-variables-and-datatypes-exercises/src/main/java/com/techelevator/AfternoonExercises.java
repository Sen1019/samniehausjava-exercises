package com.techelevator;

public class AfternoonExercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsLeft = 4;
		birdsLeft --;
		System.out.println(birdsLeft);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		int birds = 6;
		int nests = 3;
		int birdsMinusNests = birds - nests;
		System.out.println(birdsMinusNests);
        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int raccoons = 3;
		raccoons -= 2;
		System.out.println(raccoons);
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees =3;
		int flowersMinusBees= flowers - bees;
		System.out.println(flowersMinusBees);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int pidgeons = 1;
		pidgeons++;
		System.out.println(pidgeons);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owls = 3;
		owls += 2;
		System.out.println(owls);
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beavers = 2;
		beavers--;
		System.out.println(beavers);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucans = 2;
		toucans ++;
		System.out.println(toucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsMinusNuts = squirrels - nuts;
		System.out.println(squirrelsMinusNuts);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quarter = 25;
		int dime = 10;
		int nickles = 5;
		int foundMoney = quarter + dime + 2*nickles;
		System.out.println(foundMoney +" Cents");
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int briersMuffin = 18;
		int macAdamsMuffin = 20;
		int flannerysMuffin = 17;
		int hiltsMuffin = briersMuffin + macAdamsMuffin + flannerysMuffin;
		System.out.println(hiltsMuffin);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyoCents = 24;
        int whistleCents = 14;
        int toyTotal = yoyoCents + whistleCents;
        System.out.println(toyTotal);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarshies = 8;
        int miniMarshies = 10;
        int totalMarshies = largeMarshies + miniMarshies;
        System.out.println(totalMarshies);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int hiltSnow = 28;
        int brecknockSnow = 17;
        int snowDiff = hiltSnow + brecknockSnow;
        System.out.println(snowDiff);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int hiltCash = 10;
        int truckPrice = 3;
        int pencilCasePrice = 2;
        hiltCash = hiltCash - truckPrice - pencilCasePrice;
        System.out.println(hiltCash);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int jMarbles=16;
        jMarbles -=7;
        System.out.println(jMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int haveShells = 19;
        int wantShells = 25 - haveShells;
        System.out.println(wantShells);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBalloons = 17;
        int redBalloons = 8;
        int greenBalloons = totalBalloons - redBalloons;
        System.out.println(greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int bookShelf = 38;
        bookShelf += 10;
        System.out.println(bookShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int beeLegs = 6;
        bees = 8;
        int totalBeeLegs = beeLegs * bees;
        System.out.println(totalBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        int coneCost = 99;
        int coneNumber = 2;
        int totalConeCost = coneCost * coneNumber;
        System.out.println(totalConeCost + " Cents");
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int totalRock = 125;
        int hasRock = 64;
        int needsRock = totalRock - hasRock;
        System.out.println(needsRock);        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int hiltMarbles = 38;
        hiltMarbles -= 15;
        System.out.println(hiltMarbles);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int tripTotal = 78;
        int driven = 32;
        int tripLeft = tripTotal - driven;
        System.out.println(tripLeft);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        double morningShovel = 1.5;
        double afternoonShovel = 0.75;
        double totalShovel = morningShovel + afternoonShovel;
        System.out.println(totalShovel + " Hours");
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hotDogs = 6;
        int dogCost = 50;
        int totalDogCost = hotDogs + dogCost;
        System.out.println(totalDogCost + " Cents");
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int hiltMoney = 50;
        int pencilCost = 7;
        int pencilTotal = hiltMoney/pencilCost;
        System.out.println(pencilTotal);
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int hiltButterflies = 33;
        int orangeButterflies = 20;
        int redButterflies= hiltButterflies - orangeButterflies;
        System.out.println(redButterflies);
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int dollar = 100;
        int candyCost = 54;
        int candyChange = dollar - candyCost;
        System.out.println(candyChange);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int treesCurrent = 13;
        int treesToPlant = 12;
        int treesFinal = treesCurrent + treesToPlant;
        System.out.println(treesFinal);
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int daysTilGamgam = 2;
        int hoursInDay = 24;
        int hoursTilGamgam = daysTilGamgam * hoursInDay;
        System.out.println(hoursTilGamgam);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int kimsCousins = 4;
        int gumWanted = 5;
        int gumNeeded = kimsCousins * gumWanted;
        System.out.println(gumNeeded);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int danCash = 300;
        candyCost = 100;  //Reused from a different candy problem
        int danCashLeft = danCash - candyCost;
        System.out.println(danCashLeft + " Cents");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boatNumber = 5;
        int boatOccupancy = 3;
        int peopleInBoats = boatNumber + boatOccupancy;
        System.out.println(peopleInBoats);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        System.out.println("Too Few.");    
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int desiredMuffin = 83;
        int heldMuffin = 35;
        int neededMuffin = desiredMuffin - heldMuffin;
        System.out.println(neededMuffin);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayon = 1400;
        int lucyCrayon = 290;
        int willyCrayonSupremecy = willyCrayon - lucyCrayon;
        System.out.println(willyCrayonSupremecy);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersPerPage = 10;
        int pagesOfStickers = 22;
        int totalStickers= stickersPerPage * pagesOfStickers;
        System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int numberOfCupcakes = 96;  //Only int in this case because 96 is divisible by 8
        int numberOfChildren = 8;
        int cupcakesPerChild = numberOfCupcakes / numberOfChildren;
        System.out.println(cupcakesPerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int numberOfCookies = 47;
        int cookiesPerJar = 6;
        int homelessCookies = numberOfCookies % cookiesPerJar;
        System.out.println(homelessCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int numberOfCroissants = 59;
        int numberOfNeighbors = 8;
        int leftoverCroissants = numberOfCroissants % numberOfNeighbors;
        System.out.println(leftoverCroissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int cookiesPerTray = 12;  //276 is divisible by 12
        int cookiesDesired = 276;
        int traysNeeded = cookiesDesired/cookiesPerTray;
        System.out.println(traysNeeded);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzelsMade = 480;
        int pretzelsPerServing = 12;
        int servingsMade = pretzelsMade / pretzelsPerServing;
        System.out.println(servingsMade);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int totalCupcakes = 53;
        int cupcakesLeftBehind = 2;
        int cupcakesPerBox = 3;
        int numberOfBoxesForOrphans = (totalCupcakes-cupcakesLeftBehind)/cupcakesPerBox;
        System.out.println(numberOfBoxesForOrphans);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int numberOfCarrotSticks = 74;
        int numberOfPeople = 12;
        int carrotsLeftOver = 74 % 12;
        System.out.println(carrotsLeftOver);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int numberOfTeddies = 98;
        int teddiesPerShelf = 7;
        int numberOfShelves = numberOfTeddies / teddiesPerShelf;
        System.out.println(numberOfShelves);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int numberOfPictures = 480;
        int picturesPerAlbum = 20;
        int numberOfAlbums = numberOfPictures / picturesPerAlbum;
        System.out.println(numberOfAlbums);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        System.out.println("What kind of box only holds 8 Magic Cards?");    
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int numberOfBooks = 210;
        int totalShelves = 10;
        int booksPerShelf = numberOfBooks / totalShelves;
        System.out.println(booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int totalCroissants = 17;
        int totalGuests = 7;
        int croissantsPerGuest = totalCroissants / totalGuests;
        System.out.println(croissantsPerGuest);
	}

}
