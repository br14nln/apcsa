public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";

        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("cat") >= 0
        || statement.indexOf("dog") >= 0) {
            response = "Tell me more about your pets";
        } else if(statement.indexOf("Ms") >=0 || statement.indexOf("Mrs") >=0){
            response = "She sounds like a cool woman";
        } else if(statement.indexOf("Mr") >=0){
            response = "He sounds like a cool man";
        } else if(statement.indexOf("joker") >=0 ){
            response = "Why so feinious";
        } else if(statement.indexOf("skibidi") >=0 ){
            response = "Where is the toilet";
        } else if(statement.indexOf("Knowledge") >=0 ){
            response = "Do you know about strength and integrity?";
        } else if(statement.trim().length() == 0){
            response = "Say something, please.";
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "wow thats crazy bro.";
        } else if (whichResponse == 5) {
            response = "thug it out";
        } else if (whichResponse == 6) {
            response = "bro its not that deep";
        } else if (whichResponse == 7) {
            response = "gg ez go next";
        }

        return response;
    }
}