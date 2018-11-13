import java.util.Date;
import java.util.Map;

public class Mark {
    private double point;
    private Date date;

    public Mark(double point, Date date){
        this.point = point;
        this.date = date;
    }

    public Date getDate() { return date; }

    public double getPoint() { return point; }

    public void setDate(Date date) { this.date = date; }

    public void setPoint(double point) { this.point = point; }

    @Override
    public boolean equals(Object obj) {
        Mark m = (Mark) obj;
        return point == m.point && date.equals(m.date);
    }

    @Override
    public String toString() {
        return point + " " + date;
    }
}
