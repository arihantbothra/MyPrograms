/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Analysis;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalysisDepartmnetOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ReviewForm.ReviewForm;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.Rotation;

/**
 *
 * @author arihant
 */
public class PerformanceAnalysis extends javax.swing.JPanel {

    
    JFreeChart pieChart;
    JFreeChart barChart;
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private AnalysisDepartmnetOrganization analysisDepartmnetOrganization;
    private Enterprise enterprise;
    private Organization org;
    
    
    /**
     * Creates new form PerformanceAnalysiss
     */
    JPanel panel;
    public PerformanceAnalysis(JPanel panel, Organization org) {
        initComponents();
        this.panel = panel;
        this.org = org;
        plot();
    }

    void plot(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for(ReviewForm review : org.getReviewList().getReviewform_arraylist()){
            dataset.setValue(review.getPerformance1(), "Before", review.getEmployee().toString());
            dataset.setValue(review.getPerformance2(), "After", review.getEmployee().toString());
        }
        
        JFreeChart chart = ChartFactory.createBarChart("Performance", "Employee", "Efficiency", dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ));
        barPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        barPanel.add(chartPanel);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        piePanel = new javax.swing.JPanel();
        barPanel = new javax.swing.JPanel();

        javax.swing.GroupLayout piePanelLayout = new javax.swing.GroupLayout(piePanel);
        piePanel.setLayout(piePanelLayout);
        piePanelLayout.setHorizontalGroup(
            piePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        piePanelLayout.setVerticalGroup(
            piePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("pie", piePanel);

        javax.swing.GroupLayout barPanelLayout = new javax.swing.GroupLayout(barPanel);
        barPanel.setLayout(barPanelLayout);
        barPanelLayout.setHorizontalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        barPanelLayout.setVerticalGroup(
            barPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Bar", barPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel piePanel;
    // End of variables declaration//GEN-END:variables
}
