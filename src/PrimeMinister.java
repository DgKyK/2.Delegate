public class PrimeMinister {
    private String name;
    private President currentPresident;

    public PrimeMinister(President currentPresident) {
        this.name = "Bondarenko";
        this.currentPresident = currentPresident;
    }

    public void startVote() {
        if (currentPresident.isImpeachment()) {
            currentPresident.startVote();
        } else {
            System.out.println("Waiting until current President start vote!!!");
        }
    }

    public void startTradingBetweenCountries(){
        if(currentPresident.isImpeachment()) {
            currentPresident.declareCountryStatus("Trading");
        } else {
            System.out.println("For now , changing country status it`s not PrimeMinister responsibility");
        }
    }


}
