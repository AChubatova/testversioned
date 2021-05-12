package Tiger01538

import Tiger01538.buildTypes.*
import Tiger01538.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01538")
    name = "Tiger01538"

    vcsRoot(Tiger01538_cVCSroot)

    buildType(Tiger01538_Hi3)
    buildType(Tiger01538_Hi2)
    buildType(Tiger01538_Hi1)
    buildType(Tiger01538_Hi0)
})
