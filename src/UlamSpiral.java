import java.awt.*;
import java.util.ArrayList;

public class UlamSpiral extends Canvas {
    static final int BASE_NUM = 1;
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Integer> numbers = new ArrayList<>();
    private int w;
    private int h;
    private int end_num;
    private int x;
    private int y;
    private int step_size;
    private boolean is_sudden;
    private boolean with_line;

    public UlamSpiral(int width, int height, int end_num, int step_size, Color color, boolean is_sudden, boolean with_line){
        this.w = width;
        this.h = height;
        this.end_num = end_num;
        this.step_size = step_size;
        this.is_sudden = is_sudden;
        this.with_line = with_line;
        // Represents the middle points
        this.x = w / 2;
        this.y = h / 2;
        //Adjustment
        setSize(width, height);
        setBackground(color);

    }

    public boolean is_prime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public int[] update_vars(int iterator, int num_per_line, int step_num, int count){
        if(iterator == num_per_line){
            iterator = 0;
            step_num++;
            if(count % 2 == 0 && count != 0){
                num_per_line++;
            }
            count++;
        }

        switch(step_num % 4) {
            case 0: // Move right
                this.y += this.step_size;
                break;
            case 1: // Move up
                this.x += this.step_size;
                break;
            case 2: // Move left
                this.y -= this.step_size;
                break;
            case 3: // Move down
                this.x -= this.step_size;
                break;
        }
        return new int[]{iterator, num_per_line, step_num, count};
    }

    public void points_and_coordinates(ArrayList<Point> points, ArrayList<Integer> numbers){
        int step_num = 0;
        int num_per_line = 1;
        int iterator = 0;
        int count = 0;

        for(int i = BASE_NUM; i < this.end_num; i++){
            numbers.add(i);
            points.add(new Point(x, y));
            iterator++;

            int[] vars = this.update_vars(iterator, num_per_line, step_num, count);
            iterator = vars[0];
            num_per_line = vars[1];
            step_num = vars[2];
            count = vars[3];

        }
    }

    @Override
    public void paint(Graphics g){
        int offset = 5;
        float lineThickness = 2.5f;

        Graphics2D g2d = (Graphics2D) g;
        this.points_and_coordinates(this.points, this.numbers);

        g2d.setStroke(new BasicStroke(lineThickness));

        for (int i = 1; i < this.numbers.size(); i++) {
            g2d.setColor(Color.BLACK);
            int num = this.numbers.get(i);
            Point p1 = this.points.get(i - 1);
            Point p2 = this.points.get(i);

            if(this.is_prime(num)){
                g2d.fillOval((p1.x) - offset, p1.y - offset, 10, 10);
            }
            if(with_line){
                g2d.setColor(Color.GRAY);
                g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
            //else
            //g2d.drawString(Integer.toString(num), p.x - offset, p.y + offset);
            if(!is_sudden){
                try{
                    Thread.sleep(30);
                }
                catch(InterruptedException e){
                    e.printStackTrace();

                }
            }
        }
    }

}
