package queueQuestions;

public class MeanQueueCal {
	
    public static void main(String[] args) {
        int maxSize = 5; // Set the maximum size of the queue
        Queue q = new Queue(maxSize);
        // Insert some values into the original queue
        q.insert(10.0);
        q.insert(20.0);
        q.insert(30.0);

        // Calculate the mean and insert it back into the original queue
        q = calculateMean(q);

        // Print the updated queue
        System.out.println("Updated queue:");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }

    public static Queue calculateMean(Queue q) {
        double sum = 0.0;
        int count = 0;
        Queue temp = new Queue(5);
    	while(!q.isEmpty()) {
    		double val = q.remove();
    		sum += val;
    		count++;
    		temp.insert(val);
    	}
    	
    	double mean = sum/count;
    	temp.insert(mean);
    	
    	q = temp;
    	
    	return q;
    }

}
