public abstract class SupportTeam {
    protected SupportTeam successor;

    public void setSuccessor(SupportTeam successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Ticket ticket);
}
