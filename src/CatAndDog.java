public enum CatAndDog {
    CAT("kota"),
    DOG("psa");

    String name;

    CatAndDog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Ala ma ").append(CatAndDog.CAT);
        string.replace(string.indexOf(String.valueOf(CatAndDog.CAT)), string.length(), String.valueOf(CatAndDog.DOG));
        System.out.println(string);
    }
}
