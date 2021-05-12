package Tiger01312

import Tiger01312.buildTypes.*
import Tiger01312.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01312")
    name = "Tiger01312"

    vcsRoot(Tiger01312_cVCSroot)

    buildType(Tiger01312_Hi2)
    buildType(Tiger01312_Hi3)
    buildType(Tiger01312_Hi0)
    buildType(Tiger01312_Hi1)
})
