package spr.dto;

public class Govt {
      
    private String country;
    private String rules;

    public Govt(String country, String rules) {
        this.country = country;
        this.rules = rules;
    }
@Override
    public String toString(){
    
    return country+" "+rules;
    
    
    }
    public Govt() {
    }

    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the rules
     */
    public String getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(String rules) {
        this.rules = rules;
    }
    
}
