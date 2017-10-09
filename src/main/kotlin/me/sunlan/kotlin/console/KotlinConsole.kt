/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package me.sunlan.kotlin.console

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea
import org.fife.ui.rsyntaxtextarea.SyntaxConstants
import org.fife.ui.rtextarea.RTextScrollPane
import java.awt.BorderLayout
import java.awt.Component
import javax.swing.*

class KotlinConsole: JFrame {
    constructor() : super("Kotlin Console") {
        val cp = JPanel(BorderLayout())
        val splitPane = createSplitPane(createRTextScrollPane(), createResultPane())

        cp.add(splitPane)

        contentPane = cp
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
//        pack()
        setSize(800, 500)
        setLocationRelativeTo(null)
    }

    fun createSplitPane(c1: Component, c2: Component): JSplitPane {
        val splitPane = JSplitPane(JSplitPane.VERTICAL_SPLIT, c1, c2)

        return splitPane
    }

    fun createRTextScrollPane(): RTextScrollPane {
        val textArea = RSyntaxTextArea(20, 60)
        textArea.syntaxEditingStyle = SyntaxConstants.SYNTAX_STYLE_JAVA
        textArea.isCodeFoldingEnabled = true

        return RTextScrollPane(textArea)
    }

    fun createResultPane(): JTextPane {
        val textPane = JTextPane()

        return textPane
    }
}

fun main(args: Array<String>) {
    SwingUtilities.invokeLater { KotlinConsole().isVisible = true }
}
