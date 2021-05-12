package Tiger01220

import Tiger01220.buildTypes.*
import Tiger01220.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01220")
    name = "Tiger01220"

    vcsRoot(Tiger01220_cVCSroot)

    buildType(Tiger01220_Hi1)
    buildType(Tiger01220_Hi0)
    buildType(Tiger01220_Hi3)
    buildType(Tiger01220_Hi2)
})
