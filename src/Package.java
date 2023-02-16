public class Package {
    Address destination;
    Address origin;
    double pounds;
    double lengthIn;
    double widthIn;
    double heightIn;

    //Precondition: lb >= 0.1 and l, w, h are >= 2
    public Package (Address d, Address o, double lb, double l, double w, double h)
    {
        destination = d;
        origin = o;
        pounds = lb;
        lengthIn = l;
        widthIn = w;
        heightIn = h;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public double getLengthIn() {
        return lengthIn;
    }

    public void setLengthIn(double lengthIn) {
        this.lengthIn = lengthIn;
    }

    public double getWidthIn() {
        return widthIn;
    }

    public void setWidthIn(double widthIn) {
        this.widthIn = widthIn;
    }

    public double getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(double heightIn) {
        this.heightIn = heightIn;
    }
}
