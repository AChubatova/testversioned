package Tiger01446

import Tiger01446.buildTypes.*
import Tiger01446.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01446")
    name = "Tiger01446"

    vcsRoot(Tiger01446_cVCSroot)

    buildType(Tiger01446_Hi3)
    buildType(Tiger01446_Hi2)
    buildType(Tiger01446_Hi1)
    buildType(Tiger01446_Hi0)
})
