package Lab04.q4;
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
    public void addFraction(Fraction f) {
        if (this.btmN == f.btmN) {
            this.topN = this.topN + f.topN;
        } else if (this.btmN != f.btmN) {
            this.topN = this.topN * f.btmN + f.topN * this.btmN;
            this.btmN = this.btmN * f.btmN;
        }
        
    }
}
