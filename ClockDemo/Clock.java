public class Clock {

    NumberDisplay hour, minute;
    public boolean is_AM = true;
    public boolean is_AMPM_format = false;

    public Clock(int hour, int minute)
    {

        // this.hour -> hour - a 'NumberDisplay' object
        // hour -> hour - an 'int' type

        this.hour = new NumberDisplay(12);
        this.hour.setValue(hour);
        this.is_AMPM_format = false;

        if(hour >= 12)
        {
            this.is_AM = false;
        }
        else
        {
            this.is_AM = true;
        }

        this.minute = new NumberDisplay(60);
        this.minute.setValue(minute);
    }

    public Clock(int hour, int minute, Boolean is_am)
    {
        this.hour = new NumberDisplay(12);
        this.hour.setValue(hour);
        this.is_AM = is_am;
        this.is_AMPM_format = true;

        this.minute = new NumberDisplay(60);
        this.minute.setValue(minute);
    }

    public void setTime(int hour, int minute)
    {
        int min = minute % 60;
        int h = hour % 12 + (int)(minute / 60);

        if(hour >= 12) {
            this.is_AM = false;
        } else {
            this.is_AM = true;
        }

        this.hour.setValue(h);
        this.minute.setValue(h);
    }

    public void setTime(int hour, int minute, Boolean is_am)
    {
        int min = minute % 60;
        int h = hour % 12 + (int)(minute / 60);
        this.is_AM = is_am;
        this.hour.setValue(h);
        this.minute.setValue(h);
    }

    public void set_AMPM_Mode(Boolean mode)
    {
        this.is_AMPM_format = mode;
    }

    public String toString()
    {
        String h_val = !this.is_AMPM_format && !this.is_AM ? String.valueOf(12 + this.hour.getValue()) : String.valueOf(this.hour.getValue());
        String m_val = String.valueOf(this.minute.getValue());

        String am_pm = this.is_AM ? " A.M." : " P.M.";

        if(h_val.length() == 1) h_val = "0" + h_val;
        if(m_val.length() == 1) m_val = "0" + m_val;

        if(is_AMPM_format)
        {
            return h_val + ":" + m_val + am_pm;
        }
        return h_val + ":" + m_val;
    }

    public String commandAltRender()
    {

        char[] c_str = toString().toCharArray();

        for(int i = 0; i < c_str.length; i++)
        {
            if(c_str[i] == '.' || c_str[i] == ':')
            {
                c_str[i] = ' ';
            }
        }

        return String.valueOf(c_str);
    }

    public void updateTick()
    {
        minute.addValue();

        // 00:59 -> 01:00
        if(minute.getValue() == 0)
        {
            if(hour.getValue() == 11)
            {
                // 11:59 P.M. -> 00:00 A.M.
                // 11:59 A.M. -> 00:00 P.M.
                this.is_AM = !this.is_AM;
            }
            hour.addValue();
        }
    }

}