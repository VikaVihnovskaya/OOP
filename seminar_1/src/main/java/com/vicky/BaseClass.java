package com.vicky;
public abstract class BaseClass implements GameInterface {
    private String name;
    private Float hp;
    private Integer attack;
    private Integer defence;
    private Integer damageMin;
    private Integer damageMax;
    private Integer hpMax;
    private Integer speed;
    private Coordinate coordinate;
    private Status state;

    protected GameClassFinder gameClassFinder = new CoordGameClassFinder();
    protected FieldChecker fieldChecker = new DefaultFieldChecker();
    protected DistanceService distanceService = new DefaultDistanceService();
    protected StepService stepService = new DefaultStepService();

    public BaseClass(String name, Float hp, Integer attack, Integer defence, Integer damageMin, Integer damageMax, Integer hpMax, Integer speed, Coordinate coordinate) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.hpMax = hpMax;
        this.speed = speed;
        this.coordinate = coordinate;
        this.state = Status.STAND;
    }

    @Override
    public String getInfo() {
        return "Я персонаж";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getHp() {
        return hp;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getDamageMin() {
        return damageMin;
    }

    public void setDamageMin(Integer damageMin) {
        this.damageMin = damageMin;
    }

    public Integer getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(Integer damageMax) {
        this.damageMax = damageMax;
    }

    public Integer getHpMax() {
        return hpMax;
    }

    public void setHpMax(Integer hpMax) {
        this.hpMax = hpMax;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    protected void getDamage(float damage){
        hp -= damage;
        if (hp > hpMax) hp = Float.valueOf(hpMax);
        if (hp < 0) state = Status.DIE;
    }

    @Override
    public String toString() {
        return getInfo()+"{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defence=" + defence +
                ", damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                ", hpMax=" + hpMax +
                ", speed=" + speed +
                ", coordinate=" + coordinate +
                ", state=" + state +
                '}';
    }
}
