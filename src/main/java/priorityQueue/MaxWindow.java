package priorityQueue;

import java.util.List;
import java.util.PriorityQueue;

public class MaxWindow
{
    public static int maxRevenue(List<Window> windows, int k)
    {
        PriorityQueue<Window> pq = new PriorityQueue<>();
        pq.addAll(windows);

        int revenue = 0;

        while (k > 0) {
            Window window = pq.poll();
            revenue += window.tickets;
            window.tickets -= 1;
            pq.offer(window);
            k--;
        }
        return revenue;
    }
}

class Window implements Comparable<Window>
{
    public int number;

    public int tickets;

    public Window(final int number, final int tickets)
    {
        this.number = number;
        this.tickets = tickets;
    }

    @Override
    public int compareTo(final Window other)
    {
        return other.tickets - this.tickets;
    }
}
