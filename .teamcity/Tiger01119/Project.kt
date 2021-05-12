package Tiger01119

import Tiger01119.buildTypes.*
import Tiger01119.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01119")
    name = "Tiger01119"

    vcsRoot(Tiger01119_cVCSroot)

    buildType(Tiger01119_Hi0)
    buildType(Tiger01119_Hi1)
    buildType(Tiger01119_Hi2)
    buildType(Tiger01119_Hi3)
})
