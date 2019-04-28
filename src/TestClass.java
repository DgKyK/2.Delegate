public class TestClass {
    public static void main(String[] args) {
        President president = new President();
        PrimeMinister primeMinister = new PrimeMinister(president);
        president.setImpeachment(true);
        primeMinister.startVote();
        primeMinister.startTradingBetweenCountries();
    }
}
