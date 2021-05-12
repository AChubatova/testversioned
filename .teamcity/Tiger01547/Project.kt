package Tiger01547

import Tiger01547.buildTypes.*
import Tiger01547.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01547")
    name = "Tiger01547"

    vcsRoot(Tiger01547_cVCSroot)

    buildType(Tiger01547_Hi0)
    buildType(Tiger01547_Hi1)
    buildType(Tiger01547_Hi2)
    buildType(Tiger01547_Hi3)
})
