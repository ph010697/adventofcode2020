let validPasswordCount = 0;
for(let i=0;i<input.length;i++)
{
    let currentLine = input[i];
    let letterFirstPosition = input[i].substring(0,input[i].indexOf("-"));
    let letterSecondPosition = input[i].substring(input[i].indexOf("-")+1,input[i].indexOf(" "));
    let targetLetter = input[i].substring(input[i].indexOf(" ")+1,input[i].indexOf(":"));
    let givenPassword = input[i].substring(input[i].indexOf(":")+2,input[i].length);

    if(givenPassword.match(new RegExp(targetLetter || [],"g"))==null)
	    continue;

    if(givenPassword.charAt(letterFirstPosition-1)==targetLetter)
        if(givenPassword.charAt(letterSecondPosition-1)!=targetLetter){
            console.log(currentLine+" is valid password");
            validPasswordCount++;
        }
        else
            console.log(currentLine+" is not valid password");
    else
        if(givenPassword.charAt(letterSecondPosition-1)==targetLetter){
            console.log(currentLine+" is valid password");
            validPasswordCount++;
        }
        else
            console.log(currentLine+" is not valid password");

            
}
console.log(validPasswordCount);
