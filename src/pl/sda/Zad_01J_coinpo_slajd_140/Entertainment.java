package pl.sda.Zad_01J_coinpo_slajd_140;
/*
   dodaj klasę Entertainment, która zarządzać będzie systemem rozrywki w Twoim samochodzie,
   a następnie zadbaj o to, by tworząc obiekt typu Car
   konieczne było podanie obiektu typu Entertainment
*/
public class Entertainment {
    private boolean radio;      // jest- true, brak - false
    private boolean voicePhone;
    private boolean video;

    private boolean isRadioOn;  // włączone - true, wyłączone - false
    private boolean isVoicePhoneOn;
    private boolean isVideoOn;

    // konstruktor Entertainment
    public Entertainment(boolean radio, boolean voicePhone, boolean video,
                         boolean isRadioOn, boolean isVoicePhoneOn, boolean isVideoOn) {
        this.radio = radio;
        this.voicePhone = voicePhone;
        this.video = video;
        this.isRadioOn = isRadioOn;
        this.isVoicePhoneOn = isVoicePhoneOn;
        this.isVideoOn = isVideoOn;
    } // konstruktor Entertainment

    // gettery i settery

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isVoicePhone() {
        return voicePhone;
    }

    public void setVoicePhone(boolean voicePhone) {
        this.voicePhone = voicePhone;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public boolean isRadioOn() {
        return isRadioOn;
    }

    public void setRadioOn(boolean radioOn) {
        isRadioOn = radioOn;
    }

    public boolean isVoicePhoneOn() {
        return isVoicePhoneOn;
    }

    public void setVoicePhoneOn(boolean voicePhoneOn) {
        isVoicePhoneOn = voicePhoneOn;
    }

    public boolean isVideoOn() {
        return isVideoOn;
    }

    public void setVideoOn(boolean videoOn) {
        isVideoOn = videoOn;
    }


} // class Entertainment
