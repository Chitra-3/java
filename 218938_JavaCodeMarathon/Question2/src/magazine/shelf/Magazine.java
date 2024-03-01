package magazine.shelf;

public class Magazine{
    int magNo;
    String magName;
    String magAuth;
    int noP;
    double magPrice;
    public Magazine(int magNo, String magName, String magAuth, int noP, double magPrice) {
        this.magNo = magNo;
        this.magName = magName;
        this.magAuth = magAuth;
        this.noP = noP;
        this.magPrice = magPrice;
    }
    @Override
    public String toString() {
        return "Magazine [magNo=" + magNo + ", magName=" + magName + ", magAuth=" + magAuth + ", noP=" + noP
                + ", magPrice=" + magPrice + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + magNo;
        result = prime * result + ((magName == null) ? 0 : magName.hashCode());
        result = prime * result + ((magAuth == null) ? 0 : magAuth.hashCode());
        result = prime * result + noP;
        long temp;
        temp = Double.doubleToLongBits(magPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Magazine other = (Magazine) obj;
        if (magNo != other.magNo)
            return false;
        if (magName == null) {
            if (other.magName != null)
                return false;
        } else if (!magName.equals(other.magName))
            return false;
        if (magAuth == null) {
            if (other.magAuth != null)
                return false;
        } else if (!magAuth.equals(other.magAuth))
            return false;
        if (noP != other.noP)
            return false;
        if (Double.doubleToLongBits(magPrice) != Double.doubleToLongBits(other.magPrice))
            return false;
        return true;
    }
}