import java.util.ArrayList;

public class CampusLifePlanner {

    public static void main(String[] args) {

        ArrayList<PlanItem> items = new ArrayList<>();

        items.add(new Assignment("OOP Project", 3, 8));
        items.add(new ExamPreparation("Data Structures Midterm", 5, 12));
        items.add(new ClubEvent("Robotics Club Meeting", 2, 2));

        // Mark one item as completed
        items.get(2).markCompleted();

        System.out.println("=== CampusLife Planner 2.0 ===\n");

        int totalRemainingHours = 0;
        PlanItem mostUrgent = items.get(0);

        for (PlanItem item : items) {

            // Polymorphic behavior
            System.out.println(item.getDetails());

            if (!item.isCompleted()) {
                totalRemainingHours += item.getEstimatedHours();
            }

            if (item.calculateUrgency() > mostUrgent.calculateUrgency()) {
                mostUrgent = item;
            }
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Total Remaining Study Hours: " + totalRemainingHours);
        System.out.println("Most Urgent Activity: " + mostUrgent.title);
    }
}