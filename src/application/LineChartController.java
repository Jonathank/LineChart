package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class LineChartController implements Initializable{

	@FXML
	private LineChart<String,Integer> linechart;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		makeseries();
	}
 
	private void makeseries() {
		XYChart.Series <String,Integer>series = new XYChart.Series<>();
		series.setName("months of year");
		series.getData().add(new XYChart.Data<>("JAN",10));
		series.getData().add(new XYChart.Data<>("FEB",12));
		series.getData().add(new XYChart.Data<>("MAR",10));
		series.getData().add(new XYChart.Data<>("APR",60));
		series.getData().add(new XYChart.Data<>("MAY",10));
		series.getData().add(new XYChart.Data<>("JUN",12));
		series.getData().add(new XYChart.Data<>("JUL",10));
		series.getData().add(new XYChart.Data<>("AUG",60));
		series.getData().add(new XYChart.Data<>("SEP",10));
		series.getData().add(new XYChart.Data<>("OCT",12));
		series.getData().add(new XYChart.Data<>("NOV",10));
		series.getData().add(new XYChart.Data<>("DEC",60));
			linechart.getData().add(series);
	}
}
