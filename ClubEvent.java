public class ClubEvent extends PlanItem {

    public ClubEvent(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return 5 - daysUntil;  // less critical than academic work
    }

    @Override
    public String getDetails() {
        return "[Club Event] " + title +
                " | In: " + daysUntil + " days" +
                " | Duration: " + estimatedHours +
                " hrs | Urgency: " + calculateUrgency() +
                " | Status: " + getStatus();
    }
}