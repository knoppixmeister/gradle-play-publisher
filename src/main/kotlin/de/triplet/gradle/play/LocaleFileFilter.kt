package de.triplet.gradle.play

import java.io.File
import java.io.FileFilter

class LocaleFileFilter : FileFilter {
    override fun accept(file: File) = LOCALE_REGEX.matches(file.name)
}
