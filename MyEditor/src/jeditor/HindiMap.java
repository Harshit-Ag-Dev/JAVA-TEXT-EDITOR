
package jeditor;

import javax.swing.table.TableModel;

/**
 *
 * @author Harshit Agarwal
 */
public class HindiMap extends javax.swing.JFrame {

    /**
     * Creates new form HindiMap
     */
    public HindiMap() {
        initComponents();
        initializeMap();
    }

    private void initializeMap(){
        TableModel tm = mapTable.getModel();
        tm.setValueAt(Translator.toHindi("a"), 0, 0);
        tm.setValueAt("a/A", 0, 1);
        tm.setValueAt(Translator.toHindi("aa"), 0, 2);
        tm.setValueAt("aa", 0, 3);
        tm.setValueAt(Translator.toHindi("i"), 0, 4);
        tm.setValueAt("i", 0, 5);
        tm.setValueAt(Translator.toHindi("ee"), 0, 6);
        tm.setValueAt("ee/I", 0, 7);
        tm.setValueAt(Translator.toHindi("u"), 0, 8);
        tm.setValueAt("u", 0, 9);

        tm.setValueAt(Translator.toHindi("uu"), 1, 0);
        tm.setValueAt("uu/oo/U", 1, 1);
        tm.setValueAt(Translator.toHindi("RRi"), 1, 2);
        tm.setValueAt("RRi", 1, 3);
        tm.setValueAt(Translator.toHindi("e"), 1, 4);
        tm.setValueAt("e", 1, 5);
        tm.setValueAt(Translator.toHindi("ai"), 1, 6);
        tm.setValueAt("ai", 1, 7);
        tm.setValueAt(Translator.toHindi("o"), 1, 8);
        tm.setValueAt("o", 1, 9);

        tm.setValueAt(Translator.toHindi("au"), 2, 0);
        tm.setValueAt("au/ou", 2, 1);
        tm.setValueAt(Translator.toHindi("aM"), 2, 2);
        tm.setValueAt("aM", 2, 3);
        tm.setValueAt(Translator.toHindi("aH"), 2, 4);
        tm.setValueAt("aH", 2, 5);

        tm.setValueAt(Translator.toHindi(".n"), 3, 0);
        tm.setValueAt(".n", 3, 1);
        tm.setValueAt(Translator.toHindi(".N"), 3, 2);
        tm.setValueAt(".N", 3, 3);
        tm.setValueAt(Translator.toHindi(".h"), 3, 4);
        tm.setValueAt(".h", 3, 5);

        tm.setValueAt(Translator.toHindi("k")+"/"+Translator.toHindi("ka"), 4, 0);
        tm.setValueAt("k/ka", 4, 1);
        tm.setValueAt(Translator.toHindi("kh")+"/"+Translator.toHindi("kha"), 4, 2);
        tm.setValueAt("kh/kha", 4, 3);
        tm.setValueAt(Translator.toHindi("g")+"/"+Translator.toHindi("ga"), 4, 4);
        tm.setValueAt("g/ga", 4, 5);
        tm.setValueAt(Translator.toHindi("gh")+"/"+Translator.toHindi("gha"), 4, 6);
        tm.setValueAt("gh/gha", 4, 7);
        tm.setValueAt(Translator.toHindi("~N"), 4, 8);
        tm.setValueAt("~N", 4, 9);

        tm.setValueAt(Translator.toHindi("ch")+"/"+Translator.toHindi("cha"), 5, 0);
        tm.setValueAt("ch/cha", 5, 1);
        tm.setValueAt(Translator.toHindi("chh")+"/"+Translator.toHindi("chha"), 5, 2);
        tm.setValueAt("chh/chha", 5, 3);
        tm.setValueAt(Translator.toHindi("j")+"/"+Translator.toHindi("ja"), 5, 4);
        tm.setValueAt("j/ja", 5, 5);
        tm.setValueAt(Translator.toHindi("jh")+"/"+Translator.toHindi("jha"), 5, 6);
        tm.setValueAt("jh/jha", 5, 7);
        tm.setValueAt(Translator.toHindi("~n"), 5, 8);
        tm.setValueAt("~n", 5, 9);

        tm.setValueAt(Translator.toHindi("T")+"/"+Translator.toHindi("Ta"), 6, 0);
        tm.setValueAt("T/Ta", 6, 1);
        tm.setValueAt(Translator.toHindi("Th")+"/"+Translator.toHindi("Tha"), 6, 2);
        tm.setValueAt("Th/Tha", 6, 3);
        tm.setValueAt(Translator.toHindi("D")+"/"+Translator.toHindi("Da"), 6, 4);
        tm.setValueAt("D/Da", 6, 5);
        tm.setValueAt(Translator.toHindi("Dh")+"/"+Translator.toHindi("Dha"), 6, 6);
        tm.setValueAt("Dh/Dha", 6, 7);
        tm.setValueAt(Translator.toHindi("N")+"/"+Translator.toHindi("Na"), 6, 8);
        tm.setValueAt("N/Na", 6, 9);

        tm.setValueAt(Translator.toHindi("t")+"/"+Translator.toHindi("ta"), 7, 0);
        tm.setValueAt("t/ta", 7, 1);
        tm.setValueAt(Translator.toHindi("th")+"/"+Translator.toHindi("tha"), 7, 2);
        tm.setValueAt("th/tha", 7, 3);
        tm.setValueAt(Translator.toHindi("d")+"/"+Translator.toHindi("da"), 7, 4);
        tm.setValueAt("d/da", 7, 5);
        tm.setValueAt(Translator.toHindi("dh")+"/"+Translator.toHindi("dha"), 7, 6);
        tm.setValueAt("dh/dha", 7, 7);
        tm.setValueAt(Translator.toHindi("n")+"/"+Translator.toHindi("na"), 7, 8);
        tm.setValueAt("n/na", 7, 9);

        tm.setValueAt(Translator.toHindi("p")+"/"+Translator.toHindi("pa"), 8, 0);
        tm.setValueAt("p/pa", 8, 1);
        tm.setValueAt(Translator.toHindi("ph")+"/"+Translator.toHindi("pha"), 8, 2);
        tm.setValueAt("ph/pha", 8, 3);
        tm.setValueAt(Translator.toHindi("b")+"/"+Translator.toHindi("ba"), 8, 4);
        tm.setValueAt("b/ba", 8, 5);
        tm.setValueAt(Translator.toHindi("bh")+"/"+Translator.toHindi("bha"), 8, 6);
        tm.setValueAt("bh/bha", 8, 7);
        tm.setValueAt(Translator.toHindi("m"), 8, 8);
        tm.setValueAt("m", 8, 9);

        tm.setValueAt(Translator.toHindi("y")+"/"+Translator.toHindi("ya"), 9, 0);
        tm.setValueAt("y/ya", 9, 1);
        tm.setValueAt(Translator.toHindi("r")+"/"+Translator.toHindi("ra"), 9, 2);
        tm.setValueAt("r/ra", 9, 3);
        tm.setValueAt(Translator.toHindi("l")+"/"+Translator.toHindi("la"), 9, 4);
        tm.setValueAt("l/la", 9, 5);
        tm.setValueAt(Translator.toHindi("v")+"/"+Translator.toHindi("va"), 9, 6);
        tm.setValueAt("(v/w)/(va/wa)", 9, 7);

        tm.setValueAt(Translator.toHindi("sh")+"/"+Translator.toHindi("sha"), 10, 0);
        tm.setValueAt("sh/sha", 10, 1);
        tm.setValueAt(Translator.toHindi("shh")+"/"+Translator.toHindi("shha"), 10, 2);
        tm.setValueAt("shh/shha", 10, 3);
        tm.setValueAt(Translator.toHindi("s")+"/"+Translator.toHindi("sa"), 10, 4);
        tm.setValueAt("s/sa", 10, 5);
        tm.setValueAt(Translator.toHindi("h")+"/"+Translator.toHindi("ha"), 10, 6);
        tm.setValueAt("h/ha", 10, 7);
        tm.setValueAt(Translator.toHindi("L"), 10, 8);
        tm.setValueAt("L", 10, 9);

        tm.setValueAt(Translator.toHindi("kSh"), 11, 0);
        tm.setValueAt("kSh", 11, 1);
        tm.setValueAt(Translator.toHindi("tr")+"/"+Translator.toHindi("tra"), 11, 2);
        tm.setValueAt("tr/tra", 11, 3);
        tm.setValueAt(Translator.toHindi("GY")+"/"+Translator.toHindi("GYa"), 11, 4);
        tm.setValueAt("GY/GYa", 11, 5);
        tm.setValueAt(Translator.toHindi("shr")+"/"+Translator.toHindi("shra"), 11, 6);
        tm.setValueAt("shr/shra", 11, 7);



        mapTable.setModel(tm);
        mapTable.updateUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mapTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hindi Map");
        setResizable(false);

        mapTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "HIN", "ENG", "HIN", "ENG", "HIN", "ENG", "HIN", "ENG", "HIN", "ENG"
            }
        ));
        mapTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        mapTable.setShowHorizontalLines(false);
        mapTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(mapTable);

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(mainContainer, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JTable mapTable;
    // End of variables declaration//GEN-END:variables
}
