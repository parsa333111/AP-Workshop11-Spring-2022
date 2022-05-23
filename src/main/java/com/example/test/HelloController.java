package com.example.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    int monitor = 0;
    int action = 0;
    /*
    1: +
    2: -
    3: *
    4" /
     */
    @FXML
    private Button three;

    @FXML
    private Label monitor1;


    @FXML
    private Label monitor2;


    @FXML
    private Label monitor3;

    @FXML
    private Label monitor4;

    @FXML
    private Button equalb;

    @FXML
    protected void equal() {
        notif.setText("");
        if(action == 1) {
            int m1 = Integer.parseInt(monitor1.getText());
            int m2 = Integer.parseInt(monitor3.getText());
            monitor4.setText(Integer.toString(m1 + m2));
        }
        else if(action == 2) {
            int m1 = Integer.parseInt(monitor1.getText());
            int m2 = Integer.parseInt(monitor3.getText());
            monitor4.setText(Integer.toString(m1 - m2));
        }
        else if(action == 3) {
            int m1 = Integer.parseInt(monitor1.getText());
            int m2 = Integer.parseInt(monitor3.getText());
            monitor4.setText(Integer.toString(m1 * m2));
        }
        else if (action == 4){
            int m1 = Integer.parseInt(monitor1.getText());
            int m2 = Integer.parseInt(monitor3.getText());
            monitor4.setText(Double.toString((double)m1 / (double)m2));
        }
        else {
            notif.setText("Select\noperation");
            return;
        }
        monitor = 2;
    }

    @FXML
    private Button plus;

    @FXML
    protected void plus() {
        notif.setText("");
        if (monitor == 2) return;
        action = 1;
        monitor = 1;
        monitor2.setText("action : +");
    }

    @FXML
    private Button minus;

    @FXML
    protected void minus() {
        notif.setText("");
        if (monitor == 2) return;
        action = 2;
        monitor = 1;
        monitor2.setText("action : -");
    }


    @FXML
    private Button mul;

    @FXML
    protected void mul() {
        notif.setText("");
        if (monitor == 2) return;
        action = 3;
        monitor = 1;
        monitor2.setText("action : *");
    }


    @FXML
    private Button tag;

    @FXML
    protected void tag() {
        notif.setText("");
        if (monitor == 2) return;
        action = 4;
        monitor = 1;
        monitor2.setText("action : /");
    }

    @FXML
    protected Label notif;

    @FXML
    protected void addthree() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 3;
            else now = 3;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 3;
            else now = 3;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button two;

    @FXML
    protected void addtwo() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 2;
            else now = 2;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 2;
            else now = 2;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button one;

    @FXML
    protected void addone() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 1;
            else now = 1;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 1;
            else now = 1;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button four;

    @FXML
    protected void addfour() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 4;
            else now = 4;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 4;
            else now = 4;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button five;

    @FXML
    protected void addfive() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 5;
            else now = 5;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 5;
            else now = 5;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button six;

    @FXML
    protected void addsix() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 6;
            else now = 6;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 6;
            else now = 6;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    private Button seven;

    @FXML
    protected void addseven() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 7;
            else now = 7;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 7;
            else now = 7;
            monitor3.setText(Integer.toString(now));
        }
    }


    @FXML
    private Button eight;

    @FXML
    protected void addeight() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 8;
            else now = 8;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 8;
            else now = 8;
            monitor3.setText(Integer.toString(now));
        }
    }


    @FXML
    private Button nine;

    @FXML
    protected void addnine() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 9;
            else now = 9;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10 + 9;
            else now = 9;
            monitor3.setText(Integer.toString(now));
        }
    }


    @FXML
    private Button zero;

    @FXML
    protected void addzero() {
        notif.setText("");
        if(monitor == 0) {
            if (monitor1.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        else if(monitor == 1) {
            if (monitor3.getText().length() == 4) {
                notif.setText("out of range");
                return;
            }
        }
        if (monitor == 2) return;
        int now;
        if(monitor == 0) {
            String nowst = monitor1.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10;
            else now = 0;
            monitor1.setText(Integer.toString(now));
        }
        else {
            String nowst = monitor3.getText();
            if (!nowst.equals("")) now = Integer.parseInt(nowst) * 10;
            else now = 0;
            monitor3.setText(Integer.toString(now));
        }
    }

    @FXML
    protected Button reset;

    @FXML
    protected void reset() {
        notif.setText("");
        monitor = 0;
        monitor1.setText("0");
        monitor2.setText("action : ");
        monitor3.setText("0");
        monitor4.setText("");
    }

    @FXML
    protected Button backspace;

    @FXML
    protected void back() {
        notif.setText("");
        if(monitor == 0) {
            monitor1.setText(Integer.toString(Integer.parseInt(monitor1.getText()) / 10));
        }
        else if(monitor == 1) {
            monitor3.setText(Integer.toString(Integer.parseInt(monitor3.getText()) / 10));
        }
    }
}