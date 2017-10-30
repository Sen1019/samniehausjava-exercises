function sumDouble(x,y ){
    if(x == y){
        return 2*(x+y);
    }else{
        return x+y;
    }
}

function hasTeen(x, y, z){
    if(x < 20 && x > 12){
        return true;
    }
    if(y < 20 && y > 12){
        return true;
    }
    if(z < 20 && z > 12){
        return true;
    }
    return false;
}

function lastDigit(x, y){
    return x % 10 == y % 10;
}

function seeColor(x = ""){
    if(x.substring(0,3) ==  'red'){
        return 'red';
    }
    if(x.substring(0,4) == 'blue'){
        return 'blue';
    }
    return '';
}

function middleThree(x = ""){
    return x.substring((x.length - 3)/2, x.length - (x.length - 3)/2);
}

function frontAgain(x = ""){
    return x.substring(0,2)==x.substring(x.length-2,x.length);
}

function alarmClock(day, vaca){
    if(vaca == true){
        if (day == 0 || day == 6){
            return 'off';
        }
        return "10:00";
    }
    if(day == 0 || day == 6){
        return "10:00";
    }
    return "7:00";
}

function makeMiddle(array = []){
    if(array.length % 2 != 0 || array.length < 2){
        return [];
    }
    while (array.length > 2){
        array.pop();
        array.shift();
    }
    return array;
}

function oddOnly(array = []){
    var array2 =[];
    for(i = 0; i < array.length; i++){
        if(array[i] % 2 != 0){
            array2.push(array[i]);
        }
    }
    return array2;
}

function weave(x=[], y = []){
    var z = [];
    while(x.length > 0 || y.length > 0){
        if(x[0] != undefined){
            z.push(x.shift());
        }
        if(y[0] != undefined){
            z.push(y.shift());
        }
    }
    return z;
}

function cigarParty(num, weekend){
    if(weekend && num > 60){
        return true;
    }
    return (num > 40 && num < 60);
}

function stringSplosion(word){
    var wwoworword = '';
    for(i = 1; i <= word.length; i ++){
        wwoworword += word.substring(0,i);
    }
    return wwoworword;
}

function fizzBuzz(x){
    if(x%15 == 0){
        return "FizzBuzz";
    }
    if(x%5 == 0){
        return "Buzz"
    }
    if(x%3 == 0){
        return "Fizz"
    }
    return x;
}

function countValues(array){
    var map = new Object;
    for (i = 0; i < array.length; i++){
        if (map[array[i] + ""] == undefined){
            map[array[i] + ""] = 1;
        }else{
            map[array[i] + ""] += 1;
        }
    }
    return map
}

function reverseArray(array){
    return array.reverse();
}