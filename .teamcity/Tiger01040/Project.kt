package Tiger01040

import Tiger01040.buildTypes.*
import Tiger01040.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01040")
    name = "Tiger01040"

    vcsRoot(Tiger01040_cVCSroot)

    buildType(Tiger01040_Hi2)
    buildType(Tiger01040_Hi3)
    buildType(Tiger01040_Hi0)
    buildType(Tiger01040_Hi1)
})
