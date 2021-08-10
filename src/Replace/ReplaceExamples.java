package Replace;

public class ReplaceExamples {

    public static void main(String []args) {

        String name="Kenath55@#$dimuthu1234567890-=!@#$%^&*()_+";

        //This is how to drop special characters from a string
        String nameWithoutSpecialCharacters=name.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Without special characters :"+nameWithoutSpecialCharacters);

        //This is how to drop special characters & numbers from a string
        String nameWithoutSpecialCharactersAndNumbers=name.replaceAll("[^a-zA-Z]","");
        System.out.println("Without special characters and Numbers :"+nameWithoutSpecialCharactersAndNumbers);

        //This is how to only numbers from a string
        String nameWithoutOnlyNumbers=name.replaceAll("[0-9]","");
        System.out.println("Without only Numbers :"+nameWithoutOnlyNumbers);

        //Replace a character with a another character
        String Gender="Male";
        String GenderAfterReplacingACharacter=Gender.replaceAll("M","Fem");
        System.out.println("Replacing a characters with another character " +GenderAfterReplacingACharacter);

        //Remove spaces
        String Address="No 6, Test Road, Colombo  09";
        String AddressWithoutSpaces=Address.replaceAll("\\s","");
        System.out.println("Removing spaces in a string " +AddressWithoutSpaces);

        //Replace First character

        String City="Ambalanmgoda";
        String CityAfterReplacingFirstCharacter=City.replaceFirst("A","D");
        System.out.println("Replacing First Character " +CityAfterReplacingFirstCharacter);

    }
}
