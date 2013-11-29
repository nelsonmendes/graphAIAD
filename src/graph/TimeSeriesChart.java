package graph;

import java.awt.Color;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;
import org.jfree.util.Rotation;

public class TimeSeriesChart extends JFrame {

	public TimeSeriesChart(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        // This will create the dataset 
        XYDataset dataset = createDataset();
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);

    }
	
	private  XYDataset createDataset() {
		/*TimeSeries s1 = new TimeSeries("Name of the Time series", Month.class); 
		s1.add(new Month(2, 2001), 181.8); 
		s1.add(new Month(3, 2001), 167.3); 
		s1.add(new Month(4, 2001), 153.8); 
		s1.add(new Month(5, 2001), 167.6); 
		s1.add(new Month(6, 2001), 158.8); 
		s1.add(new Month(7, 2001), 148.3);
		TimeSeries s2 = new TimeSeries("L&G UK Index Trust");
		s2.add(new Month(2, 2001), 129.6);
		s2.add(new Month(3, 2001), 123.2);
		s2.add(new Month(4, 2001), 117.2);
		s2.add(new Month(5, 2001), 124.1);
		s2.add(new Month(6, 2001), 122.6);
		s2.add(new Month(7, 2001), 119.2);
		s2.add(new Month(8, 2001), 116.5);
		s2.add(new Month(9, 2001), 112.7);
		s2.add(new Month(10, 2001), 101.5);
		s2.add(new Month(11, 2001), 106.1);
		s2.add(new Month(12, 2001), 110.3);
		s2.add(new Month(1, 2002), 111.7);
		s2.add(new Month(2, 2002), 111.0);
		s2.add(new Month(3, 2002), 109.6);
		TimeSeriesCollection dataset = new TimeSeriesCollection();
		dataset.addSeries(s1);
		dataset.addSeries(s2);*/
		
		XYSeries series = new XYSeries("Average Size");
		series.add(20.0, 10.0);
		series.add(40.0, 20.0);
		series.add(70.0, 50.0);
		XYDataset seriesDataset = new XYSeriesCollection(series);
        return seriesDataset;
        
    }
	
	 private JFreeChart createChart(XYDataset dataset, String title) {
	        
		 JFreeChart chart = ChartFactory.createTimeSeriesChart( 
				  "Title of the chart", // title 
				  "X axis value",        // x-axis label 
				  "Y axis value",        // y-axis label 
				  dataset,                // data 
				  true,                    // create legend? 
				  true,                    // generate tooltips? 
				  false);                   // generate URLs?);

				  chart.setBackgroundPaint(Color.white);

				  XYPlot plot = (XYPlot) chart.getPlot(); 
				  plot.setBackgroundPaint(Color.lightGray); 
				  plot.setDomainGridlinePaint(Color.white); 
				  plot.setRangeGridlinePaint(Color.white); 
				  plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0)); 
				  plot.setDomainCrosshairVisible(true); 
				  plot.setRangeCrosshairVisible(true); 
				  XYItemRenderer r = plot.getRenderer();
				  if (r instanceof XYLineAndShapeRenderer) 
				  { 
				       XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) r; 
				       renderer.setBaseShapesVisible(true); 
				       renderer.setBaseShapesFilled(true); 
				  }
				  /*
				   * Apenas para datas
				   */
				  //DateAxis axis = (DateAxis) plot.getDomainAxis();
				  //axis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy")); 
				  return (chart);
	        
	    }
	
}
