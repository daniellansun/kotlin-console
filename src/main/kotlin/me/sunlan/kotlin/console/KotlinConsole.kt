package me.sunlan.kotlin.console

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rtextarea.RTextScrollPane
import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.SwingUtilities

class KotlinConsole: JFrame {
    constructor() : super("Kotlin Console") {
        val cp = JPanel(BorderLayout())

        val textArea = RSyntaxTextArea(20, 60)
        textArea.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
        textArea.isCodeFoldingEnabled = true
        val sp = RTextScrollPane(textArea)
        cp.add(sp)

        contentPane = cp
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        pack()
        setLocationRelativeTo(null)
    }
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater { KotlinConsole().isVisible = true }
}
