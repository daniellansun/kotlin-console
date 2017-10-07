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
