public abstract class PlanItem {

    protected String title;
    protected int daysUntil;
    protected int estimatedHours;
    protected boolean completed;

    public PlanItem(String title, int daysUntil, int estimatedHours) {
        this.title = title;
        this.daysUntil = daysUntil;
        this.estimatedHours = estimatedHours;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getDaysUntil() {
        return daysUntil;
    }

    // Polymorphic method (to be overridden)
    public abstract int calculateUrgency();

    // Polymorphic display
    public abstract String getDetails();

    public String getStatus() {
        return completed ? "Completed" : "Pending";
    }
}