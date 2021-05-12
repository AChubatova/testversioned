package Tiger01945

import Tiger01945.buildTypes.*
import Tiger01945.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01945")
    name = "Tiger01945"

    vcsRoot(Tiger01945_cVCSroot)

    buildType(Tiger01945_Hi1)
    buildType(Tiger01945_Hi0)
    buildType(Tiger01945_Hi3)
    buildType(Tiger01945_Hi2)
})
