package Tiger0736

import Tiger0736.buildTypes.*
import Tiger0736.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0736")
    name = "Tiger0736"

    vcsRoot(Tiger0736_cVCSroot)

    buildType(Tiger0736_Hi3)
    buildType(Tiger0736_Hi0)
    buildType(Tiger0736_Hi2)
    buildType(Tiger0736_Hi1)
})
