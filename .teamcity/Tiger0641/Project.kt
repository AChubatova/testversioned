package Tiger0641

import Tiger0641.buildTypes.*
import Tiger0641.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0641")
    name = "Tiger0641"

    vcsRoot(Tiger0641_cVCSroot)

    buildType(Tiger0641_Hi3)
    buildType(Tiger0641_Hi2)
    buildType(Tiger0641_Hi1)
    buildType(Tiger0641_Hi0)
})
