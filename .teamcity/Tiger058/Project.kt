package Tiger058

import Tiger058.buildTypes.*
import Tiger058.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger058")
    name = "Tiger058"

    vcsRoot(Tiger058_cVCSroot)

    buildType(Tiger058_Hi3)
    buildType(Tiger058_Hi2)
    buildType(Tiger058_Hi1)
    buildType(Tiger058_Hi0)
})
