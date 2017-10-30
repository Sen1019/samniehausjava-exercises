function iqTest(string = ""){
    var odd = 0;
    var even = 0;
    var isOdd = 4;
    var isEven = 4;

    var array = string.split(" ");

    for(i=0; i < array.length; i++){
        if(array[i] % 2 == 0){
            even = i + 1;
            if(isEven == 4){
                isEven = true;
            }else{
                isEven = false;
            }
        }else{
            odd = i + 1;
            if(isOdd == 4){
                isOdd = true;
            }else{
                isOdd = false;
            }
        }
    }
    if (isOdd){
        return odd;
    }else if (isEven){
        return even;
    }
    return 0;
}
