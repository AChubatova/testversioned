package Tiger0222

import Tiger0222.buildTypes.*
import Tiger0222.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0222")
    name = "Tiger0222"

    vcsRoot(Tiger0222_cVCSroot)

    buildType(Tiger0222_Hi0)
    buildType(Tiger0222_Hi2)
    buildType(Tiger0222_Hi1)
    buildType(Tiger0222_Hi3)
})
