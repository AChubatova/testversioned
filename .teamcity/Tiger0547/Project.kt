package Tiger0547

import Tiger0547.buildTypes.*
import Tiger0547.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0547")
    name = "Tiger0547"

    vcsRoot(Tiger0547_cVCSroot)

    buildType(Tiger0547_Hi0)
    buildType(Tiger0547_Hi3)
    buildType(Tiger0547_Hi2)
    buildType(Tiger0547_Hi1)
})
