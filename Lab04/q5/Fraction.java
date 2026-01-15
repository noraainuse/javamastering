package Lab04.q5;
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction() {
        return topN + "/" + btmN;
    }
    public String toFloat() {
        double fvalue = (double) topN / (double) btmN;
        return fvalue + "";
    }
    public void LowestTermFrac() {
        int a = this.topN;
        int b = this.btmN;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        this.topN = this.topN / a;
        this.btmN = this.btmN / a;
    }
    public boolean myEquals(Fraction x) {
        return this.topN == x.topN && this.btmN == x.btmN;
        }
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            this.topN = this.topN + f.topN;
        } else if (this.btmN != f.btmN) {
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
        
    }
}
