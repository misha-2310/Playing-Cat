public class Main {
    public static void main(String[] args) {
        boolean result = isCatPlaying(false, 35);
        System.out.println(result);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if((temperature > 24) && (temperature <= 35)){
            //System.out.println("true");
            return true;
        }

        else return (summer) && (temperature > 24) && (temperature <= 45);
    }

}
