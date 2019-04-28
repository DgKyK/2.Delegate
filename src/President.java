public class President {
    private String name;
    private boolean impeachment;


    public President() {
        this.name = "Ivanov";
    }

    public void startVote() {
        System.out.println("Starting vote....");
    }

    public void declareCountryStatus(String status){
        System.out.println("Current country status : " + status);
    }

    public boolean isImpeachment() {
        return impeachment;
    }

    public void setImpeachment(boolean impeachment) {
        this.impeachment = impeachment;
    }
}
