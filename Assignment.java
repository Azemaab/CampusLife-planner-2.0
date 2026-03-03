public class Assignment extends PlanItem {

    public Assignment(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return estimatedHours * (10 - daysUntil);
    }

    @Override
    public String getDetails() {
        return "[Assignment] " + title +
                " | Due in: " + daysUntil + " days" +
                " | Hours: " + estimatedHours +
                " | Urgency: " + calculateUrgency() +
                " | Status: " + getStatus();
    }
}