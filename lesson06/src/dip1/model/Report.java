package dip1.model;

import dip1.model.util.ReportPrinter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Report{
    private Collection<ReportItem> items;	// report data

    public Report(Collection<ReportItem> items) {
        this.items = items;
    }

    // calculate report data
//    public void calculate(){
//
//        items.add(new ReportItem("First", (float)5)); // сложные вычисления
//        items.add(new ReportItem("Second", (float)6));
//    }


    public void output(ReportManager reportManager){

        reportManager.output(items);
    }
}
