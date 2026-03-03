public class ExamPreparation extends PlanItem {

    public ExamPreparation(String title, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
    }

    @Override
    public int calculateUrgency() {
        if (completed) return 0;
        return estimatedHours * 3 + (15 - daysUntil);
    }

    @Override
    public String getDetails() {
        return "[Exam Prep] " + title +
                " | Exam in: " + daysUntil + " days" +
                " | Study Hours: " + estimatedHours +
                " | Urgency: " + calculateUrgency() +
                " | Status: " + getStatus();
    }
}
