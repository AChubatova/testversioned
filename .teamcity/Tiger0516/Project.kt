package Tiger0516

import Tiger0516.buildTypes.*
import Tiger0516.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0516")
    name = "Tiger0516"

    vcsRoot(Tiger0516_cVCSroot)

    buildType(Tiger0516_Hi3)
    buildType(Tiger0516_Hi2)
    buildType(Tiger0516_Hi1)
    buildType(Tiger0516_Hi0)
})
