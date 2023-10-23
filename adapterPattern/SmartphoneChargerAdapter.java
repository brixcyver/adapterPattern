package adapterPattern;

class SmartphoneChargerAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    public SmartphoneChargerAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        charger.chargePhone();
    }
}